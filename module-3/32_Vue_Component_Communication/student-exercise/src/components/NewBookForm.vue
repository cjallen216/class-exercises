<template>
  <form class="new-book-form" v-on:submit.prevent="saveBook">
    <label for="title">Title: </label>
    <input class="title-input" type="text" v-model="book.title" />
    <label for="author">Author: </label>
    <input class="author-input" type="text" v-model="book.author" />
    <label for="isbn">ISBN: </label>
    <input class="isbn-input" type="text" v-model="book.isbn" />
    <button>Save</button>
  </form>
</template>

<script>
export default {
    data() {
        return {
            book: {
                title: '',
                author: '',
                read: false,
                isbn: ''
            }
        }
    },
    name: 'new-book-form',
    methods: {
        saveBook() {
            this.$store.commit('ADD_BOOK', this.book);
            this.book = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            };
        }
    }
}
</script>

<style>
.new-book-form
{
    padding: 10px;
}

input, label
{
    margin: 10px;
}

</style>