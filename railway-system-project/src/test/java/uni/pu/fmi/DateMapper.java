package uni.pu.fmi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.Transformer;

public class DateMapper extends Transformer<Date> {

	@Override
	public Date transform(String value) {
		Date date = null;
		if("" != value) 
			try {
				date = new SimpleDateFormat("dd-MM-yyyy").parse(value);
			} catch (ParseException e) {
				//e.printStackTrace();
			}
		return date;

	}

}
