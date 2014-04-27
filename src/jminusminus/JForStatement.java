package jminusminus;


import static jminusminus.CLConstants.*;

public class JForStatement extends JStatement {

	/** Initialize a variable. */
	private JStatement initialize;
	
	/** Statement that terminates the loop */
	private JExpression terminate;

	/** Statement that updates the variable for next loop */
	private JExpression update;

	/** Statement that occurs on every loop */
	private JStatement consequent;
	
//	/** Statement that checks for initial that is a statement */
//	private JStatement initialize2;
	
	public JForStatement(int line, JStatement initialize, JExpression terminate,
			JExpression update, JStatement consequent) {
		super(line);
		this.initialize = initialize;
		this.terminate = terminate;
		this.update = update;
		this.consequent = consequent;
	}

//	public JForStatement(int line, JStatement initialize2, JStatement terminate,
//			JExpression update, JStatement consequent) {
//		super(line);
//		this.initialize2 = initialize2;
//		this.terminate = terminate;
//		this.update = update;
//		this.consequent = consequent;
//	}
	
	
	public JAST analyze(Context context) {
        initialize.analyze(context);
        terminate.analyze(context);
        terminate.type().mustMatchExpected(line(), Type.BOOLEAN);
        if (update != null) {
            update.analyze(context);
        }

        consequent.analyze(context);

        return this;
	}

	public void codegen(CLEmitter output) {
        initialize.codegen(output);

        String test = output.createLabel();
        String out = output.createLabel();

        // Branch out of the loop on the test condition
        // being false
        output.addLabel(test);
        terminate.codegen(output, out, false);

        // Codegen body
        consequent.codegen(output);
        update.codegen(output);
        // Unconditional jump back up to test
        output.addBranchInstruction(GOTO, test);

        // The label below and outside the loop
        output.addLabel(out);
	}

	public void writeToStdOut(PrettyPrinter p) {
		p.printf("<JForStatement line=\"%d\">\n", line());
		p.indentRight();
		p.printf("<Initialization>\n");
		p.indentRight();
		initialize.writeToStdOut(p);
		p.indentLeft();
		p.printf("</Initialization>\n");
		p.printf("<Termination>\n");
		p.indentRight();
		terminate.writeToStdOut(p);
		p.indentLeft();
		p.printf("</Termination>\n");
		p.printf("<Update>\n");
		p.indentRight();
		update.writeToStdOut(p);
		p.indentLeft();
		p.printf("</Update>\n");
		p.printf("<Consequent>\n");
		p.indentRight();
		consequent.writeToStdOut(p);
		p.indentLeft();
		p.printf("</Consequent>\n");
		p.indentLeft();
		p.printf("</JForStatement>\n");
	}

}
