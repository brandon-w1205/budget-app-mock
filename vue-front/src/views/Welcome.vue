<script setup lang="ts">
import { ref, onMounted } from 'vue'

let budgets = ref([])

async function allBudgets() {
    await fetch("http://localhost:8080/budgets", { method: "GET" , mode: 'no-cors' })
        // .then(res => console.log(res.json()))
        .then(res => res.json())
        .then(data => console.log(data))
        // .catch(err => console.log(err.message))
    }

allBudgets()

onMounted(() => {


   

})


</script>

<template>
    <div class="home">
        <h1>Home</h1>
        <p></p>
        <router-link to="/dashboard">Go to Dashboard</router-link>
    </div>

    <div>
        <p>{{ budgets.map(
            budget => { return budget }
        ) }}</p>
    </div>
</template>