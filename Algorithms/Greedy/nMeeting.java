// Definition of Meeting class implementing Comparable interface
class Meeting implements Comparable<Meeting>{
    int start;
    int end;
    
    // Constructor to initialize start and end times of a meeting
    Meeting (int start, int end){
        this.start = start;
        this.end = end;
    }
    
    // Overriding compareTo method to compare meetings based on end times
    @Override
    public int compareTo(Meeting other){
        return this.end - other.end;
    }
}

// Solution class containing method to find maximum number of meetings
class Solution 
{
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // Creating an array of Meeting objects to store meeting details
        Meeting[] meetings = new Meeting[n];
        // Populating the array with Meeting objects using provided start and end times
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }
        
        // Sorting meetings array based on end times using Arrays.sort method
        Arrays.sort(meetings);
        
        // Initializing count variable to keep track of the maximum number of meetings
        int count = 1; // We can always accommodate the first meeting
        int endTime = meetings[0].end; // Storing the end time of the first meeting
        
        // Iterating through the sorted meetings array starting from the second meeting
        for (int i = 1; i < n; i++) {
            // If the start time of the current meeting is greater than the end time
            // of the previous meeting, we can accommodate this meeting, so increment count
            // and update endTime to the end time of the current meeting
            if (meetings[i].start > endTime) {
                count++;
                endTime = meetings[i].end;
            }
        }
        
        // Returning the maximum number of meetings that can be accommodated
        return count;
    }
}
