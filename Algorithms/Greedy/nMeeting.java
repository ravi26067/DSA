import java.util.*;

class Solution {
    
    // Inner class representing a meeting
    class Meeting implements Comparable<Meeting> {
        int start;  // Start time of the meeting
        int end;    // End time of the meeting
        int pos;    // Position of the meeting
        
        // Constructor to initialize meeting details
        public Meeting(int start, int end ,int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
        
        // Implementation of compareTo method to compare meetings based on end times
        @Override
        public int compareTo(Meeting other){
            if (this.end != other.end) // If the end times are different
                return this.end - other.end; // Sort based on end time
            else // If end times are the same
                return this.start - other.start; // Sort based on start time
        }
    }
    
    // Method to find the maximum number of meetings
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Integer> answer = new ArrayList(); // List to store the positions of selected meetings
        Meeting[] meeting = new Meeting[N]; // Array to store Meeting objects
        
        // Creating Meeting objects and populating the meetings array
        for (int i = 0; i < N; i++) {
            meeting[i] = new Meeting(S[i], F[i], i + 1);
        }
        
        Arrays.sort(meeting); // Sorting the meetings array based on end times
        
        int endT = meeting[0].end; // Initializing endT with the end time of the first meeting
        answer.add(meeting[0].pos); // Adding the position of the first meeting to the answer list
        
        // Iterating through the sorted meetings array starting from the second meeting
        for (int i = 1; i < N; i++) {
            // If the start time of the current meeting is greater than or equal to endT,
            // we can accommodate this meeting, so add its position to the answer list
            // and update endT to the end time of the current meeting
            if (meeting[i].start >= endT) {
                answer.add(meeting[i].pos);
                endT = meeting[i].end;
            }
        }
        Collections.sort(answer);
        return answer; // Return the list of selected meetings
    }
    
}
