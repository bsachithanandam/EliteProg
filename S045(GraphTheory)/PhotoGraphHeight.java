/*

There are N students in a high school class. For simplicity, the students are named A, B, C, . . . (up to the N letter of
the alphabet). No two students have exactly the same height.
The Principal of the school wants to organize a class photograph where the students are arranged in ascending order
of heights. The class teacher has been asked to list the students in ascending order of heights to send to the
photographer.
The teacher does not know the heights of the various students. However, there are a set of Kphotographs, which
between them have all the students in that class. From each of the photographs, the teacher obtained a list of
students in ascending height order and needs to combine them into one list of students in ascending height order.
It is possible that the photographs do not fully determine the ordering in the list. In this case, as it is vacation time,
the teacher needs to write to some of the students to send her their exact height, so that she can create the
complete list.
The objective is to write a program that can list the students to whom she must write to determine their heights. If it
is not necessary to write to any student, the output should be N/A

Boundary Condition(s):
2 <= N <= 26
1 <= K <= 10

Input Format:
The first line contains N and K separated by a comma.
The next K lines, each contains a comma separated list of the students in ascending order from the corresponding photograph.

Output Format:
The first line contains the list of students whose height must be known to create the ordered list separated by space or N/A.

Example Input/Output 1:
Input:
8,3
D,C,E,F,G,H
C,A,E
D,C,B,E
Output:
A B
Explanation:
Here N is 8 and K is 3. The students are A, B, C, D, E, F, G and H (the first N letters of the alphabet).
From photographs 1, 2 and 3, we can determine that A, B, C and D are shorter than E, F, G, H, and that E, F, G, H are
the last four in the ordered list.
From the first photograph, D is shorter than C, and from the second photograph, C is shorter than A. From the third
photograph, C is shorter than B. The possible orders of the first four could be D, C, A, B or D, C, B, A. No information
is present in any of the photographs which says which order is correct. Hence the teacher must write to both B and A
to determine their heights so as to establish the correct order. The output must be sorted in alphabetic order, and
hence the output is A B.

Example Input/Output 2:
Input:
8,3
D,C,E,F,G,H
C,A,B,E
D,B
Output:
N/A
Explanation:
Here N is 8 and K is 3, and so there are 8 students and 3 photographs. As the students are named the first N letters
of the alphabet, the students are A, B, C, D, E, F, G and H.
The first photograph shows the ordering as D, C, E, F, G, H, that is D is shorter than C who is shorter than E and so on.
The second photograph shows that C is shorter than A, who is shorter than B who is shorter than E. The third
photograph shows that D is shorter than B.
From photograph 1, E, F, G and H are all taller than C, and are in that order. From photograph 2, A and B are shorter
than E and in that order. Hence A, B, C and D are all shorter than E, F, G and H. Hence the last four in the final
ordered list must be E, F, G, H in that order.
From the first photograph, D is shorter than C, and from the second photograph, C is shorter than A who is shorter
than B. Hence the order of the first four is D, C, A, B.
Hence the full list is D, C, A, B, E, F, G, H. The full order can be determined without writing to any student to get their
height. Hence the output is N/A.

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(",");
		int n = Integer.parseInt(a[0].trim());
		int k = Integer.parseInt(a[1].trim());
		String names = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0,n);
		List<String> photo = new ArrayList<>();
		for(int i=1;i<=k;i++){
		    photo.add(sc.nextLine().trim().replaceAll(",",""));
		}
		boolean missing = false;
		for(Character name :names.toCharArray()){
		    int relcount = 0;
		    Queue<Character> queue = new ArrayDeque<>();
		    List<Character> visited = new ArrayList<>();
		    queue.add(name);visited.add(name);
		    while(!queue.isEmpty()){
		        Character student = queue.poll();
		        for(String seq :photo){
		            if(seq.contains(student.toString())){
		                String succ = seq.substring(seq.indexOf(student));
		                for(Character succs : succ.toCharArray()){
		                    if(!visited.contains(succs)){
		                        queue.add(succs);
		                        visited.add(succs);
		                        relcount++;
		                    }
		                }
		            }
		        }
		    }
		    queue.add(name);
		    while(!queue.isEmpty()){
		        Character student = queue.poll();
		        for(String seq : photo){
		            if(seq.contains(student.toString())){
		                String pred = seq.substring(0,seq.indexOf(student));
		                for(Character preds:pred.toCharArray()){
		                    if(!visited.contains(preds)){
		                        queue.add(preds);
		                        visited.add(preds);
		                        relcount++;
		                    }
		                }
		            }
		        }
		    }
		    if(relcount != n-1){
		        System.out.print(name+" ");
		        missing = true;
		    }
		}
		if(!missing){
		    System.out.println("N/A");
		}
		

	}
}
