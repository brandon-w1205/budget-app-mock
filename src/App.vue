<script setup lang="ts">
import HelloWorld from './components/HelloWorld.vue'
import Dashboard from './components/Dashboard.vue'
import DoughnutChart from './components/DoughnutChart.vue';
</script>

<template>
  <!-- <HelloWorld msg="Vite + Vue + TS" /> -->
  <Dashboard />
  <!-- <DoughnutChart /> -->
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}

.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}

.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
