package eu.interopehrate.hri.thri.api;

import org.json.JSONObject;
import org.json.simple.parser.ParseException;

public interface HealthRecordIndexI {
    JSONObject getCloud(String auth, String citizenId) throws ParseException, java.text.ParseException;
}
