
package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {
    
    public ResultSet viewDoctorDetails(){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM doctor");
            result = state.executeQuery();
            
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    }
    
    public ResultSet viewPatientDetails(){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM patient");
            result = state.executeQuery();
            
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    
    }
    public ResultSet viewEmployeeDetails(){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM employee");
            result = state.executeQuery();
            
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    }
    
}
