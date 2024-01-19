// let numbers = input.txt
"use strict"
function numResult(numbers) {
  let numberArray = numbers.split("\n");
  //numberArray.split;
  //console.log("array is:");
  //console.log(numberArray);
  let sumsArray = [];
  let tempSuma = 0;

  for (let i = 0; i < numberArray.length - 1; i++) {
    //if there is an array at all
    if (numberArray[i].length !== 0) tempSuma += parseInt(numberArray[i]);
    //tempSuma += parseInt(numberArray[i]);
    if (numberArray[i].length === 0) {
      sumsArray.push(tempSuma);
      tempSuma = 0;
    }
    //console.log(i);
    //console.log(numberArray.length);
    if (i === numberArray.length - 2) {
      sumsArray.push(tempSuma);
    }
  }
  //console.log(sumsArray);
  //let result = Math.max.apply(null, sumsArray);//Reshenie na 1va chast!!!!

  //let result2 = sumsArray.sort[0];
  //console.log(parseInt(""));
  //console.log(`The highest number is ${result}`);
  //console.log(typeof sumsArray[2]);
  sumsArray.sort((a, b) => b - a);
  let result = sumsArray[0] + sumsArray[1] + sumsArray[2];
  return result;
}

console.log(numResult(numbers));
