import java.io.File

class Question(val question: String, val a: String, val b: String, val c: String,  val d: String, val answer: String) {

}


fun main() {
  var questionArray: ArrayList<Question> = readFile()

  var score = 0
  questionArray.forEach {
    displayQA(it)
    if (getUserAnswer() == it.answer) {
      println("Correct")
      score += 1
    }
    else {
      println("Wrong")
    }
  }

  val total = questionArray.size
  val percent = score.toFloat() / total.toFloat()
  val displayPercent = Math.round(percent * 100)
  println("You got $score out of $total correct. That is $displayPercent%")
}

fun getUserAnswer(): String {
  while (true) {
    print("Answer: ")
    val answer = readLine()
    when (answer?.toLowerCase()) {
      "a" -> return "a"
      "b" -> return "b"
      "c" -> return "c"
      "d" -> return "d"
      else -> {
        println("Type a, b, c, or d. Try Again.")
      }
    }

  }

}


fun displayQA(question: Question) {
  println()
  println(question.question)
  println(question.a)
  println(question.b)
  println(question.c)
  println(question.d)
}


fun readFile(): ArrayList<Question> {
  var questionList = ArrayList<Question>()
  var counter = 0
  var question = ArrayList<String>()
  File("questions.txt").forEachLine {

    if (counter < 6) {
      question.add(it)
      counter += 1
    }
    else {
      questionList.add(Question(question[0], question[1], question[2], question[3], question[4], question[5]))
      counter = 0
      question = ArrayList<String>()
    }

  }

  return questionList
}
