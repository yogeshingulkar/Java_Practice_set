class InvalidAgeException extends RuntimeException
{
	private String msg="invalid age!!!";
	InvalidAgeException(String msg)
	{
		this.msg=msg;
	}
	InvalidAgeException()
	{
	}	
	public String toString()
	{
		return "InvalidAgeException:"+msg;
	}
}