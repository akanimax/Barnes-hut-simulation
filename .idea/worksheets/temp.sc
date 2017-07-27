// to generate the start points where the elements need to
// be copied in the combiner array
val starts = (0 until 100 by 10) :+ 100

// generate the chunks of data
starts.tail
val chunks = starts.zip(starts.tail)

// test if the zipwithindex method is suggested by the editor
starts.zipWithIndex

10 +: Seq(1, 2, 3, 4, 5)

// checking how the for expression works on
// parallel sequence

val parSeq = Seq(1, 2, 3, 4, 5, 6, 7).par

parSeq.map(_ + 2).seq