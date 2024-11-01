import static org.junit.jupiter.api.Assertions.*;

class ImpFileTest2
{

	public ImpFile<Object> file;
	
	public void setUp() throws Exception
	{
		this.file = new ImpFile<>(null, null);
	}

	public void tearDown() throws Exception
	{
	}
	@test
	public void test1() throws ExceptionFileVide
	{
		this.file.enfiler("test");
		assertEquals(this.file.estVide(), true);
		
		this.file.défiler();
		assertEquals(!this.file.estVide(), true);
	}
	
	public void test2() throws ExceptionFileVide
	{
		this.file.premier();
	}

	public void test3() throws ExceptionFileVide
	{
		this.file.défiler();
	}
	
	public void test4() throws ExceptionFileVide
	{
		this.file.enfiler("a");
		this.file.enfiler("b");
		this.file.enfiler("c");
		
		assertEquals(this.file.premier() == "a", true);
		this.file.défiler();
		
		assertEquals(this.file.premier() == "b", true);
		this.file.défiler();
		
		assertEquals(this.file.premier() == "c", true);
		this.file.défiler();
	}
	
	public static void main(String[] args)
	{
		
	}

}
