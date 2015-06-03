package com.skycloud.api.domain.base;
public class MaintenanceTimePeriod{
	private String timeperiodid;
	private Integer day;
	private Integer dayofweek;
	private Integer every;
	private Integer month;
	private Integer period;
	private String start_date;
	private Integer start_time;
	private Integer timeperiod_type;
	public void setTimeperiodid(String timeperiodid) {
		this.timeperiodid = timeperiodid;
	}
	public String getTimeperiodid() {
		return timeperiodid;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getDay() {
		return day;
	}
	public void setDayofweek(Integer dayofweek) {
		this.dayofweek = dayofweek;
	}
	public Integer getDayofweek() {
		return dayofweek;
	}
	public void setEvery(Integer every) {
		this.every = every;
	}
	public Integer getEvery() {
		return every;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getMonth() {
		return month;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_time(Integer start_time) {
		this.start_time = start_time;
	}
	public Integer getStart_time() {
		return start_time;
	}
	public void setTimeperiod_type(Integer timeperiod_type) {
		this.timeperiod_type = timeperiod_type;
	}
	public Integer getTimeperiod_type() {
		return timeperiod_type;
	}
}
