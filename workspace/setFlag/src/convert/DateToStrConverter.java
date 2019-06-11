package convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * S - source:源
 * T - target:目标
 * @author abcd
 *
 */
public class DateToStrConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(source);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String convertStr(Date date) {
		//Date指定格式：yyyy-MM-dd
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(date);
	}
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(new DateToStrConverter().convertStr(d));
	}

}
