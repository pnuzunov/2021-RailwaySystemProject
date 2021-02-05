package uni.pu.fmi;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import uni.pu.fmi.models.QueryScreenModel;

public class QueryScreenTest {
	
	static QueryScreenModel model = new QueryScreenModel();
	
	public static void main() {
		model.navigate();
		model.setFromStation(new TrainStation("Sofia"));
		model.setToStation(new TrainStation("Plovdiv"));
		try {
			model.setDate1(new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2021"));
			model.setDate2(new SimpleDateFormat("dd-MM-yyyy").parse("02-01-2021"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		model.clickQueryButton();
		System.out.println(model.getResultMessage());
	}
}
