class TimeMap {
    Map<String, List<Pair>> timeMap;
    public TimeMap() {
        timeMap = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        List<Pair> list = timeMap.get(key);
        if (list == null) {
            list = new ArrayList<>();
            timeMap.put(key, list);
        }
        list.add(new Pair(value,timestamp));
        
    }
    
    public String get(String key, int timestamp){

        List<Pair> values = timeMap.getOrDefault(key, new ArrayList<>());
        int left =0, right = values.size()-1;
        String result = "";
        while(left<=right){
            int mid = left + (right - left) / 2;
            if (values.get(mid).geTimestamp() <= timestamp) {
                result = values.get(mid).getValue();
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
        
    
    
}
class Pair{
    private String value;
    private int timestamp;

    public Pair(String value, int timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }

    public String getValue(){
        return this.value;
    }

    public int geTimestamp(){
        return this.timestamp;
    }
}