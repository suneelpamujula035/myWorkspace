package com.seleniumexpress.resultsetextractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentAddressResultSetExtractor implements ResultSetExtractor<Map<String, List<String>>> {

	@Override
	public Map<String, List<String>> extractData(ResultSet res) throws SQLException, DataAccessException {

		// Banglore {Suneel}}
		// Noida {Naresh}

		Map<String, List<String>> studentTable = new HashMap<>();

		while (res.next()) {
			String studentName = res.getString("STUDENT_NAME");// Karthik
			String studentAddress = res.getString("STUDENT_ADDRESS");// Banglore

			List<String> studentNameList = studentTable.get(studentAddress);

			if (studentNameList == null) {
				ArrayList<String> newStudentList = new ArrayList<String>();
				newStudentList.add(studentName);

				studentTable.put(studentAddress, newStudentList);
			} else {
				studentNameList.add(studentName);
			}
		}
		return studentTable;
	}

}
