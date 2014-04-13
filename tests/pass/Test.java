package pass;

public class Test {
	public void test(int x){

		// Operators
		
		|
		||
		|=
		<
		<=
		<<=
		<<
		>
		>=
		>>
		>>>
		^
		^=
		&
		&&
		-
		-=
		--
		+
		+=
		++
		%
		%=
		*
		*=
		!
		!=
		?
		:
		=
		==
		/

		abstract
		assert
		boolean
		break
		byte
		case
		catch
		char
		class
		const

		continue
		default
		do
		double
		else
		enum
		extends
		final
		finally
		float

		for
		goto
		if
		implements
		import
		instanceof
		int
		interface
		long
		native

		new
		package
		private
		protected
		public
		return
		short
		static
		strictfp
		super

		switch
		synchronized
		this
		throw
		throws
		transient
		try
		void
		volatile
		while
			
		// Double tests
			
		1.23		// pass // Works
		123.123		// pass // Works
		1.2.3		// fail // Does not work
		077			// fail // Works
		089.		// pass // Works
		1._23		// fail // Does not work
		1_2.		// pass	// Works
		1.2_3		// pass	// Works
		1.2____3	// pass // Works
		1.23d		// pass // Works
		1.23f		// pass // Works
		1.23df		// fail // Does not work
		1.23fd		// fail // Does not Work
		
		1.23e+4		// pass // Works
		1.23e-4		// pass // Works
		1.23E+4		// pass // Works
		1.23E-4		// pass // Works
		1.2_34e5	// pass // Works

		.123		// pass // Works
		.123.123	// fail // Does not work
		._123		// fail // Does not work
		.123_123	// pass // Works
		.123d		// pass // Works
		.123f		// pass	// Works
			
		_1.23		// fail // Does not work

		

	}}