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
 * @brief class Exercicio05
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
 
float X, Y; 
 
X = ler.nextFloat(); 
Y = ler.nextFloat(); 
 
if(X == 0 && Y != 0){ 
System.out.printf("Eixo Y%n"); 
}else if(X != 0 && Y == 0){ 
System.out.printf("Eixo X%n"); 
}else if(X > 0 && Y > 0){ 
System.out.printf("Q1%n"); 
}else if(X < 0 && Y > 0){ 
System.out.printf("Q2%n"); 
}else if(X < 0 && Y < 0){ 
System.out.printf("Q3%n"); 
}else if(X > 0 && Y < 0){ 
System.out.printf("Q4%n"); 
}else if(X == 0 && Y == 0){ 
System.out.printf("Origem%n"); 
} 
}
    }

