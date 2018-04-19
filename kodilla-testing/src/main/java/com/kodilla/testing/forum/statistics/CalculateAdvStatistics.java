package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.Map;

public class CalculateAdvStatistics {

    public HashMap<String, Integer> calculateAdvStatistics(Statistics statistics) {
        public HashMap<String, Integer> numberUser(){
            HashMap<String, Integer> resultUser = new HashMap<String, Integer>();
            for(Map.Entry<String, Integer> user : users.getUsers().entrySet()) {
                resultUser.size(user.getKey(), user.getValue());
            }
            return resultUser;
        }
    }

    public void showStatistics(){

    }

}