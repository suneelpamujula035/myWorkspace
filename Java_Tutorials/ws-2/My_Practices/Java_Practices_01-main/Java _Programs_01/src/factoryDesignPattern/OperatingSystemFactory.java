package factoryDesignPattern;

public class OperatingSystemFactory {

	public OS getInstance(String str)
	{
		if(str.equalsIgnoreCase("open"))
		{
			return new Android();
		}
		else if(str.equalsIgnoreCase("secured"))
		{
			return new IOS();
		}
		else
		{
			return new Windows();
		}
	}
}
