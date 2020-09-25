

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang3.StringUtils;

import com.ibm.tealeaf.webportal.common.utils.DateFormatUtil;

public class TimeTest {
	
	public static void main(String[] args) {
		System.out.println(DateFormatUtil.parseDate("20200805122222"));
		System.out.println(DateFormatUtil.parseDate("2020-08-05 12:22:22"));
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		calendar.setTime(new Date());
		calendar.add(calendar.DATE,-1);
		String date2= sdf.format(calendar.getTime());
		System.out.println(date2);
		
		

	    String userTimeZone = "UTC Time";
		TimeZone customerTimeZone = TimeZone.getTimeZone(userTimeZone);
		long startDateTime = DateFormatUtil.parseDateTimeZone(date2, DateFormatUtil.DATE_FORMAT_WITH_HYPHEN, customerTimeZone).getTime();
		
		
	}

}
