package com.example.mr_kajol.finalproject;

import java.util.HashMap;
import java.util.Map;

public class UpdateClass {
   public String Height, Weight,PAL, Date, Calorie;

    UpdateClass() {

    }

    public UpdateClass(String Height, String Weight,String PAL, String Date, String Calorie) {
        this.Height = Height;
        this.Weight = Weight;
        this.PAL = PAL;
        this.Date = Date;
        this.Calorie = Calorie;

    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("Height", Height);
        result.put("Weight", Weight);
        result.put("PAL", PAL);
        result.put("Date", Date);
        result.put("Calorie", Calorie);

        return result;
    }
}
