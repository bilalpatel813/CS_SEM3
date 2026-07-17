// basic func
function add(a,b){
    return a+b;
}
console.log(add(2,5))
//var func
const subtract = function(a, b) {
    return a - b;
}
console.log(subtract(3,6))
//variable arrow func 
const multiply = (a,b) => a * b;
console.log(multiply(5,2))
//default parameter func
function greetUser(name = "Guest") {
  console.log("Hello," + name );
}
greetUser()
//rest parameter func
function sum(...numbers){

    return numbers.reduce((total,m)=>total +m,0)
}
restfunc = sum(1,2,3,4,5)
console.log(restfunc)

// callback functions 
function processData(data, callback) {
  const result = data.toUpperCase();
  callback(result);
}
processData("hello", (output) => console.log(output)); 

function grade(marks){
    switch (true) {
        case marks >= 90:
            console.log("O Grade");
            break;
        case marks >= 70:
            console.log("A Grade");
            break;
        case marks >= 50:
            console.log("B Grade");
            break;
        case marks >= 40:
            console.log("C Grade");
            break;
        case marks >= 35:
            console.log("D Grade");
            break;
        default:
            console.log("Unpadh bache")
    }
}

grade(54);
// 2-d array 
const grid = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
console.log(grid[2][2]); 

const person = {
    name :"bilal",
    age : 19,
    greet(){
        console.log("hello from CTO")
    }
}
console.log(person.name);
console.log(person.age);
person.greet()
person.email="abc@gmail.com"
console.log(person)
