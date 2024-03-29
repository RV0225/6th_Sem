// Add smooth scrolling to links
$(document).ready(function () {
  $("a").on("click", function (event) {
    if (this.hash !== "") {
      event.preventDefault();
      var hash = this.hash;
      $("html, body").animate(
        {
          scrollTop: $(hash).offset().top,
        },
        800,
        function () {
          window.location.hash = hash;
        }
      );
    }
  });
});

// Show and hide mobile menu
$(document).ready(function () {
  $(".menu-toggle").click(function () {
    $("nav").toggleClass("active");
  });
});
