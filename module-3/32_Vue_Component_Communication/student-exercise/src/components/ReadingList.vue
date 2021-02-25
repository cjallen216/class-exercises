<template>
  <div class="book-container">
    <book-card v-for="book in books"
      v-bind:key="book.card"
      v-bind:book="book" />    
  </div>
</template>

<script>
import BookCard from './BookCard.vue';

export default {
  components: { BookCard },
    name: 'reading-list',
  
    computed: {
    filteredBooks() {
      const booksFilter = this.$store.state.filter;
      const books = this.$store.state.card;
      return books.filter(book => {
        return booksFilter === book;
      });
    }
  }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>