// Assuming you have a function to check if the user is logged in
function isLoggedIn() {
  // Implement your logic to check if the user is logged in
  // This could be checking for a certain cookie, local storage item, etc.
  // Return true if logged in, false otherwise
}

// Call this function when the page loads
window.onload = function () {
  if (isLoggedIn()) {
    // If the user is logged in, change the button to a person icon with dropdown
    document.querySelector(".appoint").innerHTML = `
      <div class="dropdown">
        <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fas fa-user"></i>
        </button>
        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
          <a class="dropdown-item" href="/your-orders">Your Orders</a>
          <a class="dropdown-item" href="/your-lab-tests">Your Lab Tests</a>
          <a class="dropdown-item" href="/logout">Logout</a>
        </div>
      </div>
    `;
  }
};

$(document).ready(function () {
  $("#nav-head").scrollToFixed();

  $(".filter-button").click(function () {
    var value = $(this).attr("data-filter");

    if (value == "all") {
      $(".filter").show("100");
    } else {
      $(".filter")
        .not("." + value)
        .hide("50");
      $(".filter")
        .filter("." + value)
        .show("50");
    }

    // Remove 'active' class from all buttons and add it only to the clicked one
    $(".filter-button").removeClass("active");
    $(this).addClass("active");
  });
});

// Wait for the document to be fully loaded
document.addEventListener("DOMContentLoaded", function () {
  // Find the button by its ID
  var submitBtn = document.getElementById("submitBtn");

  // Add a click event listener to the button
  submitBtn.addEventListener("click", function () {
    // Display a pop-up message when the button is clicked
    alert(
      "Lab test booked successfully. You will receive a confirmation message, and payment will be done after pickup."
    );
  });
});
