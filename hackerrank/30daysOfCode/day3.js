'use strict'

/**
 * Javascript (Node.js) solution for {@link https://www.hackerrank.com/challenges/30-conditional-statements/problem} Day 3: Intro to Conditional Statements
 * @author Emelie Widegren <widegren.emelie@gmail.com>
 */

process.stdin.resume()
process.stdin.setEncoding('utf-8')

let inputString = ''
let currentLine = 0

process.stdin.on('data', inputStdin => {
  inputString += inputStdin
})

process.stdin.on('end', _ => {
  inputString = inputString.replace(/\s*$/, '')
    .split('\n')
    .map(str => str.replace(/\s*$/, ''))

  main()
})

function readLine () {
  return inputString[currentLine++]
}

function main () {
  const N = parseInt(readLine(), 10)
  if (N % 2 !== 0) {
    console.log('Weird')
  } else if (N > 20) {
    console.log('Not Weird')
  } else if (N > 6) {
    console.log('Weird')
  } else {
    console.log('Not Weird')
  }
}
