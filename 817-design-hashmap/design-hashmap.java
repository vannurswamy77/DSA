class MyHashMap {
    ArrayList<Node> map;
    int size;
    float lf=0.5f;
    public MyHashMap() {
        map=new ArrayList<>();
        for(int i=0;i<10;i++){
            map.add(new Node(-1,-1));
        }
        size=0;
    }
    private int hash(int key) {
        return Math.abs(key) % map.size();
    }
    
    public void put(int key, int value) {
        if ((float) size / map.size() > lf) {
            rehash();
        }
        int hash=hash(key);
        Node curr=map.get(hash);
        while(curr.next!=null){
            if(curr.next.key==key){
                curr.next.value=value;
                return;
            }
            curr=curr.next;
        }
        curr.next=new Node(key,value);
        size++;
    }
    
    public int get(int key) {
        int hash=hash(key);
        Node curr=map.get(hash).next;
        while(curr!=null){
            if(curr.key==key){
                return curr.value;
            }
            curr=curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int hash=hash(key);
        Node curr=map.get(hash);
        while(curr.next!=null){
            if(curr.next.key==key){
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;;
        }

    }
    public void rehash() {
        ArrayList<Node> old = map;

        map= new ArrayList<>();
        size = 0;

        // double size
        for (int i = 0; i < old.size() * 2; i++) {
            map.add(new Node(-1,-1));
        }

        // re-insert entries
        for ( Node entries : old) {
            Node curr=entries.next;
            while(curr!=null){
                put(curr.key,curr.value);
                curr=curr.next;
            }
        }
    }
    class Node{
        int key;
        int value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
            this.next=null;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */