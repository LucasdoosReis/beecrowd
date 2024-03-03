/*
 * Copyright (C) 2024 Lucas  Reis <lucaslladder@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista01;
import java.util.Scanner;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 02/03/24
 * @brief class Exercicio06
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
 
int A, B, C; 
int l, m, n; 
 
A = ler.nextInt(); 
B = ler.nextInt(); 
C = ler.nextInt(); 
l = 0; 
m = 0; 
n = 0; 
if(A > B && A >C){ 
l = A; 
if(B > C){ 
m = B; 
n = C; 
}else{ 
m = C; 
n = B; 
} 
 
}else if( B> A && B >C){ 
l = B; 
if(A > C){ 
m = A; 
n = C; 
}else{ 
m = C; 
n = A; 
} 
 
}else if(C > B && C > A){ 
l = C; 
if(B > A){ 
m = B; 
n = A; 
}else{ 
m= A; 
n = B;
} 
 
} 
 
System.out.printf("%d%n",n); 
System.out.printf("%d%n",m); 
System.out.printf("%d%n%n",l); 
System.out.printf("%d%n",A); 
System.out.printf("%d%n",B); 
System.out.printf("%d%n",C); 
 
 
 
} 
    
}
