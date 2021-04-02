package com.gsheet.poc;

import java.util.List;

import com.ghseet.utils.GoogleSheetAPI;

public class GsheetTest {
	private static String spreadsheetId = "1gQrQvHMKCicNIqgI7W7sRFD1f2Ld9NDyvWjyPB7Kn9I";
	private static String range = "'TEST_MAP'!A1:G2";

	public static void main(String[] args) {
		GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
		try {
			List<List<Object>> values = sheetAPI.getSpreadSheetRecords(spreadsheetId, range);
			for (List<Object> row : values) {
				System.out.println(row.toString());
			}
		} catch (Exception e) {
			System.out.println("Error in main method: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
