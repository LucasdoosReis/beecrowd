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
 * @brief class Exercicio04
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
double A, B, C, delta, R1, R2; 
A = ler.nextDouble(); 
B = ler.nextDouble(); 
C = ler.nextDouble(); 
 
delta = (Math.pow(B,2)) -4*A*C; 
 
delta = (Math.sqrt(delta)); 
 
if(delta > 0 && A !=0 ){ 
R1= -(B)+delta; 
R2= -(B)-delta; 
 
R1= R1 / (2*A); 
R2= R2 / (2*A); 
System.out.printf("R1 = %.5f%n",R1); 
System.out.printf("R2 = %.5f%n",R2); 
 
}else{ 
System.out.printf("Impossivel calcular%n"); 
} 
} 
    
}
