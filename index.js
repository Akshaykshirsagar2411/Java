
var a = {

    name:"akshay",
    last:"kshirsagar",

    salary: function(){

        return this.name +" " +this.last;
    },
    arr: [1,3,6,6,7,7]
    
    
}
var arr2 = [1,4,3,5,,5,3,];

console.log(a.name);
console.log(a.salary());
console.log(a.arr);
console.log(arr2);