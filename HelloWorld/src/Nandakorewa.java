import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

import org.omg.PortableInterceptor.AdapterManagerIdHelper;

public class Nandakorewa
{
	private String name;
	private LocalDate birthday;

	/**
	 * 
	 */
	public Nandakorewa()
	{
		super();
			this.name = "blah blah";
		this.birthday = LocalDate.of(1997, 01, 19);

	}

	/**
	 * @param name
	 * @param birthday
	 */
	public Nandakorewa(String name, int y, int m, int d)
	{
		super();
		this.name = name;
		this.birthday = LocalDate.of(y, m, d);
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "[name=" + name + ", birthday=" + birthday + ", age=" +age() +"]";
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the birthday
	 */
	public LocalDate getBirthday()
	{
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(LocalDate birthday)
	{
		this.birthday = birthday;
	}

	public int age()
	{
		LocalDate cd = LocalDate.now();
		return Period.between(birthday, cd).getYears();
	}
}
