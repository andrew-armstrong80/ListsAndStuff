class BankAccount(num : String) {
  override def toString: String = s"accountNumber: $num"

  val accounts = for (num <- 1 to 10) yield new BankAccount(s"$num")
}

val personsWithAccounts = List(
  ("adam",
    List(
      accounts(0),
      accounts(1)
    )
  ),
  ("Daniel",
    List(
      accounts(1)
    )
  ),
  ("Michael",
    List(
      accounts(2)
    )
  ),
  ("Chris",
    List(
      accounts(3)
    )
  ),
  ("Connor",
    List(
      accounts(4)
    )
  )


)

for (
  p <- personsWithAccount; accounts <- p.2
) yield s"${p.1} ${accounts}"

val allInfoOnAdam = ("Adam", 21, new BankAccount("1234")
)
