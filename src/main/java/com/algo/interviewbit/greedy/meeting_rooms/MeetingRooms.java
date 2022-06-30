package com.algo.interviewbit.greedy.meeting_rooms;

import java.util.Arrays;
import java.util.Objects;

public class MeetingRooms {
    private static final int START = 0;
    private static final int END = 1;

    private static class MeetingTime implements Comparable<MeetingTime> {
        private static final int ACQUIRE = 1;
        private static final int RELEASE = -1;

        final int value;
        final int action;

        MeetingTime(int value, int type) {
            this.value = value;
            this.action = type == START ? ACQUIRE : RELEASE;
        }

        @Override
        public int compareTo(MeetingTime o) {
            int compareResult = Integer.compare(value, o.value);
            if (compareResult == 0) {
                return Integer.compare(action, o.action); // RELEASE prioritises over ACQUIRE
            }
            return compareResult;
        }
    }

    public int leastNumberOfMeetingRooms(int[][] intervals) {
        Objects.requireNonNull(intervals, "intervals must be non null");

        MeetingTime[] meetingTimes = new MeetingTime[2 * intervals.length];
        int idx = 0;
        for (int[] interval: intervals) {
            meetingTimes[idx++] = new MeetingTime(interval[START], START);
            meetingTimes[idx++] = new MeetingTime(interval[END], END);
        }

        int maxMeetingRooms = 0;
        int currentlyUsedMeetingRooms = 0;
        Arrays.sort(meetingTimes);
        for (var meetingTime: meetingTimes) {
            currentlyUsedMeetingRooms += meetingTime.action;
            maxMeetingRooms = Math.max(maxMeetingRooms, currentlyUsedMeetingRooms);
        }

        return maxMeetingRooms;
    }
}
