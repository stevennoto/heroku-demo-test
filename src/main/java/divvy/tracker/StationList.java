package divvy.tracker;

import java.util.List;

public class StationList {
    private String executionTime;
	private List<Station> stationBeanList;

	public String getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(String executionTime) {
		this.executionTime = executionTime;
	}
	
	public List<Station> getStationList() {
		return stationBeanList;
	}
	
	public void setStationList(List<Station> stationList) {
		this.stationBeanList = stationList;
	}
	
	public Station getStation(long id) {
		if (stationBeanList == null || stationBeanList.isEmpty()) {
			return null;
		}
		for (Station station : stationBeanList) {
			if (station != null && station.getId() == id) {
				return station;
			}
		}
		return null;
	}
	
	public Station getStation(String name) {
		if (stationBeanList == null || stationBeanList.isEmpty()) {
			return null;
		}
		for (Station station : stationBeanList) {
			if (station != null && station.getStationName() != null && station.getStationName().equalsIgnoreCase(name)) {
				return station;
			}
		}
		return null;
	}
}
