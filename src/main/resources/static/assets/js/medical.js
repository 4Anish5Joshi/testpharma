$(document).ready(function () {
  // Array to store items in the shopping cart
  var shoppingCart = [];

  // Function to handle "Add to Cart" button click
  $(".add-to-cart-btn").click(function () {
    var itemName = $(this).data("name");
    var itemPrice = $(this).data("price");

    // Create an object representing the item
    var newItem = {
      name: itemName,
      price: itemPrice,
    };

    // Add the item to the shopping cart array
    shoppingCart.push(newItem);

    // Optional: Display a confirmation message or update the UI
    alert(itemName + " added to the cart!");

    // Optional: Update the shopping cart icon or display the cart contents
    updateShoppingCartIcon();
  });

  // Function to update the shopping cart icon (example)
  function updateShoppingCartIcon() {
    var cartIcon = $(".cart-icon");
    var cartItemCount = shoppingCart.length;

    // Update the cart icon with the item count
    cartIcon.text("Cart (" + cartItemCount + ")");
  }
});
