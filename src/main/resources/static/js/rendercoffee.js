(function () {
    "use strict";

    // Define your coffees array here
    let coffees = [
        { id: 1, name: 'Death PB and J', roast: 'light', price: 10, image: '/imgs/lightLogo.jpg' },
        { id: 2, name: 'Death Ethiopia', roast: 'light', price: 10, image: '/imgs/lightLogo.jpg' },
        { id: 3, name: 'Death Salted Caramel', roast: 'medium', price: 12, image: '/imgs/mediumLogo.jpg' },
        { id: 4, name: 'Death French Toast', roast: 'medium', price: 12, image: '/imgs/mediumLogo.jpg' },
        { id: 5, name: 'Death Pumpkin King', roast: 'medium', price: 12, image: '/imgs/mediumLogo.jpg' },
        { id: 6, name: 'Death Irish Cream', roast: 'medium', price: 12, image: '/imgs/mediumLogo.jpg' },
        { id: 7, name: 'Death Dark Chocolate', roast: 'dark', price: 14, image: '/imgs/darkLogo.jpg' },
        { id: 8, name: 'Death Sumatra', roast: 'dark', price: 14, image: '/imgs/darkLogo.jpg' },
        { id: 9, name: 'Death Banana Foster', roast: 'dark', price: 14, image: '/imgs/darkLogo.jpg' },
    ];

    let cartTotal = 0; // Initialize cartTotal to 0

    // Function to create a Bootstrap card for a coffee product
    function createCoffeeCard(coffee) {
        const card = document.createElement('div');
        card.className = 'col-md-4 mb-4';

        const cardContent = `
            <div class="card h-100">
                <img src="${coffee.image}" class="card-img-top" alt="${coffee.name}">
                <div class="card-body d-flex flex-column">
                    <h5 class="card-title">${coffee.name}</h5>
                    <p class="card-text">Roast: ${coffee.roast}</p>
                    <p class="card-text">Price: $${coffee.price}</p>
                    <button class="btn btn-primary mt-auto btn-add-to-cart" data-name="${coffee.name}" data-price="${coffee.price}" data-image="${coffee.image}">Add to Cart</button>
                </div>
            </div>
        `;

        card.innerHTML = cardContent;
        return card;
    }

    // Function to render all coffee products as cards
    function renderCoffeeProducts(coffees) {
        const coffeeProductsContainer = document.getElementById('coffee-products');
        coffeeProductsContainer.innerHTML = ''; // Clear existing content

        for (const coffee of coffees) {
            const coffeeCard = createCoffeeCard(coffee);
            coffeeProductsContainer.appendChild(coffeeCard);
        }
    }

    // Event listener for adding coffee to the cart
    document.addEventListener('click', function (event) {
        if (event.target.classList.contains('btn-add-to-cart')) {
            const coffeeName = event.target.getAttribute('data-name');
            const coffeePrice = parseFloat(event.target.getAttribute('data-price'));
            const coffeeImage = event.target.getAttribute('data-image');
            addToCart(coffeeName, coffeePrice, coffeeImage);
        }
    });

    // Function to update the cart display with animation
    function updateCartDisplay() {
        const cartContainer = document.getElementById('cart');
        const cartItemsContainer = document.getElementById('cart-items');
        const cartTotalContainer = document.getElementById('cart-total');
        cartItemsContainer.innerHTML = ''; // Clear existing cart content

        for (const item of cart) {
            const cartItem = document.createElement('div');
            cartItem.className = 'cart-item d-flex align-items-center mb-3';
            cartItem.innerHTML = `
                <img src="${item.image}" class="cart-item-image me-3" alt="${item.name}" style="width: 50px; height: 50px;">
                <div>
                    <p class="mb-0">Coffee: ${item.name}</p>
                    <p class="mb-0">Price: $${item.price}</p>
                </div>
            `;
            cartItemsContainer.appendChild(cartItem);
        }

        cartTotalContainer.textContent = `Total: $${cartTotal}`;

        // Add a class to trigger the slide-in animation
        cartContainer.classList.add('cart-slidein');

        // Set a timeout to remove the animation class after the animation finishes
        setTimeout(() => {
            cartContainer.classList.remove('cart-slidein');
        }, 1000); // Adjust the duration as needed
    }

    // Define an array to store cart items
    const cart = [];

    // Function to add an item to the cart
    function addToCart(name, price, image) {
        cart.push({ name, price, image });
        cartTotal += price;
        updateCartDisplay();
    }

    // Initial rendering of coffee products
    renderCoffeeProducts(coffees);

    // Event listener to open the cart modal
    const openCartButton = document.getElementById('openCartButton');
    openCartButton.addEventListener('click', function () {
        const cartModal = new bootstrap.Modal(document.getElementById('cartModal'));
        cartModal.show();
    });
})();
