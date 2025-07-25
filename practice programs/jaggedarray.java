class jaggedarray
{
public static void main(String args[])
{
int [][] jaggedarray={
{1,2,3},
{4,5},
{6,7,8,9}
};
for(int i=0;i<jaggedarray.length;i++)
{
for(int j=0;j<jaggedarray[i].length;j++)
{
System.out.print(jaggedarray[i][j]+" ");
}
System.out.println();
}
}
}

/*ubuntu@ubuntu-HP-Pro-Tower-280-G9-PCI-Desktop-PC:~$ gedit jaggedarray.java
ubuntu@ubuntu-HP-Pro-Tower-280-G9-PCI-Desktop-PC:~$ javac jaggedarray.java
ubuntu@ubuntu-HP-Pro-Tower-280-G9-PCI-Desktop-PC:~$ java jaggedarray
1 2 3 
4 5 
6 7 8 9 
*\
