package ProcessModel;

public class Process implements Comparable<Process>{
    String processName = "";
    String userName = "";
    Integer niceValue = 0;
    Integer priority;

    public Process(String processName, String userName,Integer niceValue){
        this.processName = processName;
        this.userName = userName;
        this.niceValue = niceValue;
        calcPriority(niceValue);
    }

    private void calcPriority(Integer niceValue){
        priority = 120+niceValue;
    }

    public Integer getPriority(){
        return priority;
    }

    public String getProcessName(){
        return this.processName;
    }

    public String getUserName(){
        return this.userName;
    }

    public Integer getNiceValue(){
        return this.niceValue;
    }

    @Override
    public int compareTo(Process o) {
        return this.getPriority().compareTo(o.getPriority());
    }

    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append("Process: "+getProcessName()+", "+getUserName()+", "+getNiceValue()+", PR = "+getPriority());
        return s.toString();
    }
}
