// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
/**
function addRandomGreeting() {
  const greetings =
      ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}
*/

/**
 * Adds a random quote to the page.

function addRandomQuote() {
  const quotes =
      ['You got no jams!', 'Stobp it!', 'My goal is to live a healthy life and die in a natural way.', 'Food before family.'];

  // Pick a random quote.
  const quote = quotes[Math.floor(Math.random() * quotes.length)];

  // Add it to the page.
  const quoteContainer = document.getElementById('quote-container');
  quoteContainer.innerText = quote;
}
*/

  // Server Date fetch()
async function showTimesClicked() {
  const responseFromServer = await fetch('/test_servlet');
  const textFromResponse = await responseFromServer.text();

  const dateContainer = document.getElementById('button-container');
  dateContainer.innerText = textFromResponse;
}

async function getRandomFact() {
  const responseFromServer = await fetch('/get-facts');
  const stats = await responseFromServer.json();
  const facts =
      ['I love learning things in general. Especially becoming good at them.', 'My first time flying alone had me stuck at an airport for 8+ hours.', 'I love traveling. I once stayed 3 weeks in S. Korea with my younger sister, learning the language and culture.', 'I can eat almost anything, but its rather hard for me to find something I truly enjoy.'];

  // Pick a random fact
  const fact = facts[Math.floor(Math.random() * facts.length)];

  // Add it to the page.
  const quoteContainer = document.getElementById('quote-container');
  quoteContainer.innerText = fact;
}
