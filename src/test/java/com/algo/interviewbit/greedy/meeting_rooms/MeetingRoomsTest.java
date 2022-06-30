package com.algo.interviewbit.greedy.meeting_rooms;


import com.algo.leetcode.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsTest extends AbstractExecuteTests<TestCase> {
    public MeetingRoomsTest() {
        super("MeetingRoomsTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.intervals, testCase.output);
    }

    private void executeTest(int[][] intervals, int expected) {
        var solution = new MeetingRooms();
        int actual = solution.leastNumberOfMeetingRooms(intervals);
        assertEquals(expected, actual);
    }
}