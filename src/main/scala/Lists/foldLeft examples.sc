class Product(val name: String, val category: String, val price: Int) {
  override def toString(): String = {
    s"$name - $category ($price)"
  }
}

val bread = new Product("Bread", "Food", 80)
val milk = new Product("Milk", "Food", 60)
val washingUpLiquid = new Product("Washing up liquid", "Household", 100)
val bleach = new Product("Bleach", "Household", 70)
val potatoes = new Product("Potatoes", "Food", 115)


val basket = List(bread, milk, milk, washingUpLiquid, bleach, potatoes, bread)

// 1. What is the total price?
basket.foldRight(0)(_.price + _)
basket.foldLeft(0)(_ + _.price)
basket.foldRight(0)((prod, acc) => prod.price + acc)
basket.foldLeft(0)((acc, prod) => acc + prod.price)

// 2. How much has been spent on food?
basket.filter(p => p.category == "Food").foldRight(0)(_.price + _)

// 3. What is the total if there’s a 10% off sale?
basket.map(_.price * 0.9).foldRight(0.0)(_ + _)
basket.map(_.price * 0.9).foldRight(0d)(_ + _)

// 4. What is the total if you have a voucher for 50% off washing up liquid?
basket.map(p => if(p.name == "Washing up liquid") p.price * 0.5 else p.price).foldRight(0d)(_ + _)