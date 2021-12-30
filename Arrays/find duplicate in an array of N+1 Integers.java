package Arrays;


//sort
public int find(int[] nums){
    Arrays.sort(nums);
    for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i+1]){
            return nums[i];
        }
    }
    return -1;
}


//Set
public int find(int[] nums){
    Set<Integer> seen=new HashSet<Integer>();
    for(int num:nums){
        if(seen.contains(num)){
            return num;
        }
        seen.add(num);
    }
    return -1;
}


//HashMap(recursive)
public int store(int[] nums,int cur){
    if(cur==nums[cur]) return cur;
    int nxt=nums[cur];
    nums[cur]=cur;
    return store(nums,nxt);
}

//HashMap(iterative)
public int find(int[] nums){
    while(nums[0]=nums[nums[0]])
    int nxt=nums[nums[0]];
    nums[nums[0]]=nums[0];
    nums[0]=nxt;
}
return nums[0];
}


//BS
public static int duplicate(int[] nums){
    int low=1;
    int high=nums.length-1;
    int duplicate=-1;
    while(low<=high){
        int cur=(left+right)/2;

        int count=0;
        for(int n:nums){
            if(n<=cur){
                count++;
            }
        }
        if(count>cur){
            duplicate=cur;
            high=cur-1;
        }else{
            low=cur+1;
        }
    }
    return duplicate;
}


///floyd algo
public static void main(String[] args){
    int tortoise=nums[0];
    int hare=nums[0];
    do{
        tortoise=nums[tortoise];
        hare=nums[nums[hare]];
    }while(tortoise!=hare);
    tortoise=nums[0];
    while(tortoise!=hare){
        tortoise=nums[tortoise];
        hare=nums[hare];
    }
   return hare;
   //O(n)--> T.C
   //O(1) -->S.c
}
