class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int boatCount = 0;

        int i=0;
        int j=people.length-1;

        Arrays.sort(people);

        while(i<=j){
            if(people[i]+people[j]<=limit){
                boatCount++;

                i++;
                j--;
            }else if(people[j]<=limit){
                boatCount++;

                j--;
            }
        }

        return boatCount;
    }
}