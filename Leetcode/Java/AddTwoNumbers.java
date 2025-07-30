'''
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

'''


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def __init__(self):
        self.head=None
    def addTwoNumbers(self, l1, l2):
        rem=0
        while l1!=None or l2!=None or rem!=0:
            if l1==None and l2!=None:
                ele=l2.val+rem
                l2=l2.next
            elif l2==None and l1!=None:
                ele=l1.val+rem
                l1=l1.next
            elif l1!=None and l2!=None:
                ele=l1.val+l2.val+rem
                l1=l1.next
                l2=l2.next
            else:
                ele=rem
            if ele//10==0:
                rem=0
            elif ele%10==0:
                rem=ele//10
                ele=ele%10
            else:
                rem=ele//10
                ele=ele%10
            newnode=ListNode(ele)
            if self.head==None:
                self.head=newnode
            else:
                temp=self.head
                while temp.next!=None:
                    temp=temp.next
                temp.next=newnode
        return self.head

        