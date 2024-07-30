(function () {
    "use strict";

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

    let cartTotal = 0;

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

    function renderCoffeeProducts(coffees) {
        const coffeeProductsContainer = document.getElementById('coffee-products');
        coffeeProductsContainer.innerHTML = '';

        for (const coffee of coffees) {
            const coffeeCard = createCoffeeCard(coffee);
            coffeeProductsContainer.appendChild(coffeeCard);
        }
    }

    document.addEventListener('click', function (event) {
        if (event.target.classList.contains('btn-add-to-cart')) {
            const coffeeName = event.target.getAttribute('data-name');
            const coffeePrice = parseFloat(event.target.getAttribute('data-price'));
            const coffeeImage = event.target.getAttribute('data-image');
            addToCart(coffeeName, coffeePrice, coffeeImage);
        }
    });

    function updateCartDisplay() {
        const cartContainer = document.getElementById('cart');
        const cartItemsContainer = document.getElementById('cart-items');
        const cartTotalContainer = document.getElementById('cart-total');
        cartItemsContainer.innerHTML = '';

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
        cartContainer.classList.add('cart-slidein');

        setTimeout(() => {
            cartContainer.classList.remove('cart-slidein');
        }, 1000);
    }

    const cart = [];

    function addToCart(name, price, image) {
        cart.push({ name, price, image });
        cartTotal += price;
        updateCartDisplay();
    }

    // Function to filter and render coffee products based on the search query
    function filterCoffees(query) {
        query = query.toLowerCase();
        const filteredCoffees = coffees.filter(coffee => coffee.name.toLowerCase().includes(query));
        renderCoffeeProducts(filteredCoffees);
    }

    // Event listener for the search bar input
    document.querySelector('input[type="search"]').addEventListener('input', function (event) {
        const query = event.target.value;
        filterCoffees(query);
    });

    // Initial rendering of coffee products
    renderCoffeeProducts(coffees);
})();
