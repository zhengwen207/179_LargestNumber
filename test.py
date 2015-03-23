
AA =[123, 45, 456, 453, 9];

# This function compares two strings
def compare(s1, s2):

    a1 = int(s1+s2);
    a2 = int(s2+s1);

    return cmp(a1,a2);


def largestNumber(a):

    # convert a to a list of strings
    
    for i in xrange(0, len(a)):
        a[i]=str(a[i]);

    # sort the array based on compare
    a.sort(cmp=compare, reverse=True);

    b="";

    for i in xrange(0, len(a)):
        
        b+=a[i];

    return b;


BB=largestNumber(AA);

print(BB);
  
   
        
    
    

