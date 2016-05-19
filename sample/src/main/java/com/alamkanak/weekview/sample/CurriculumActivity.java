package com.alamkanak.weekview.sample;

import com.alamkanak.weekview.ClassEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yiwen Lu on 5/15/2016.
 */
public class CurriculumActivity extends BaseCurriculumActivity {

    @Override
    public List<? extends ClassEvent> onMonthChange(int newYear, int newMonth) {
        // Populate the curriculum view with some events.
        List<ClassEvent> events = new ArrayList<ClassEvent>();

        events.add(new ClassEvent(1, "微积分A", "六教6C101", 2016, 4, 15, 1));
        events.add(new ClassEvent(2, "微积分A", "六教6C101", 2016, 4, 16, 2));
        events.add(new ClassEvent(3, "毛泽东思想和中国特色社会主义理论体系概论", "六教6C300", 2016, 4, 16, 3));
        events.add(new ClassEvent(4, "毛泽东思想和中国特色社会主义理论体系概论", "六教6C300", 2016, 4, 16, 4));
        events.add(new ClassEvent(5, "你全家都上毛泽东思想和中国特色社会主义理论体系概论", "六教6C300", 2016, 4, 17, 1));
        events.add(new ClassEvent(6, "你全家都上毛泽东思想和中国特色社会主义理论体系概论", "六教6C300", 2016, 4, 17, 2));
        events.add(new ClassEvent(7, "你全家都上毛泽东思想和中国特色社会主义理论体系概论", "六教6C300", 2016, 4, 17, 3));
        events.add(new ClassEvent(8, "微积分B", "六教6C101", 2016, 4, 16, 2));

        return events;
    }

}
