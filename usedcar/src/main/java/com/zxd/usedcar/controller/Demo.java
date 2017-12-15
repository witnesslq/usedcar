package com.zxd.usedcar.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
public class Demo {
	private static Connection conn;

	private static Connection getConn() {
		if (conn == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/usedcar", "root", "");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	@RequestMapping(value = "/demo/one", method = { RequestMethod.GET })
	@ResponseBody
	public String getAllOne() {
		JSONArray array = new JSONArray();
		try {
			PreparedStatement ps = getConn().prepareStatement(
					"select one_id,one_name from test group by one_id");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				JSONObject obj = new JSONObject();
				obj.put("one_id", rs.getInt("one_id"));
				obj.put("one_name", rs.getString("one_name"));
				array.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return array.toString();
	}

	@RequestMapping(value = "/demo/two/{one_id}", method = { RequestMethod.GET })
	@ResponseBody
	public String getTwoByOne_id(@PathVariable("one_id") int one_id) {
		JSONArray array = new JSONArray();
		try {
			PreparedStatement ps = getConn()
					.prepareStatement(
							"select two_id,two_name from test where one_id=? group by two_id");
			ps.setInt(1, one_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				JSONObject obj = new JSONObject();
				obj.put("two_id", rs.getInt("two_id"));
				obj.put("two_name", rs.getString("two_name"));
				array.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return array.toString();
	}

	@RequestMapping(value = "/demo/three/{one_id}/{two_id}", method = { RequestMethod.GET })
	@ResponseBody
	public String getThreeByTwo_id(@PathVariable("one_id") int one_id,
			@PathVariable("two_id") int two_id) {
		JSONArray array = new JSONArray();
		try {
			PreparedStatement ps = getConn()
					.prepareStatement(
							"select three_id,three_name from test where one_id=? and two_id=? group by three_id");
			ps.setInt(1, one_id);
			ps.setInt(2, two_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				JSONObject obj = new JSONObject();
				obj.put("three_id", rs.getInt("three_id"));
				obj.put("three_name", rs.getString("three_name"));
				array.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return array.toString();
	}
}
