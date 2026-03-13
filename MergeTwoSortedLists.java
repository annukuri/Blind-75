
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
     ListNode itr1=list1;
        ListNode itr2=list2;
        ListNode newList= new ListNode(), head= newList;
        if(itr1==null && itr2==null) return null;
        while(itr1!=null && itr2!=null)
        {
            System.out.print("j");
            if(itr1.val<=itr2.val)
            {
                newList.val=itr1.val;
                itr1=itr1.next;
                newList.next=new ListNode();
                newList=newList.next;
            }
            else if(itr1.val> itr2.val)
            {
                newList.val=itr2.val;
                itr2=itr2.next;
                newList.next= new ListNode();
                newList= newList.next;
            }
        }
        if(itr1==null) itr1=itr2;
        while(itr1!=null){
            newList.val=itr1.val;
            itr1=itr1.next;
            if(itr1!=null) newList.next=new ListNode();
            newList=newList.next;
        }
        return head;
    }   
}
